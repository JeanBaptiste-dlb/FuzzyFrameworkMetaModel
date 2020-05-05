#include <iostream>
#include <fstream>
#include "ExpressionFactory.h"
#include "CogDefuzz.h"
#include "FuzzyFactory.h"
#include "IsRamp.h"
#include "IsGaussian.h"
#include "IsTrapeze.h"
#include "IsTriangle.h"
#include "AndMin.h"
#include "OrPlus.h"
#include "OrMax.h"
#include "ThenMin.h"
#include "AggPlus.h"
#include "NotMinus1.h"
#include "AggMax.h"

using namespace Core;
using namespace Fuzzy;
using namespace std;

int main(){
	AndMin<float> opAnd;
	NotMinus1<float> opNot;
	OrMax<float> opOr;
	ThenMin<float> opThen;
	CogDefuzz<float> opDefuzz (0,25,0.1);
	AggMax<float> opAgg;
	SugenoDefuzz<float> opSugenoDefuzz;	
	FuzzyFactory<float> f((And<float>*) &opAnd, (Or<float>*)&opOr, (Then<float>*)&opThen, (Agg<float>*)&opAgg, &opDefuzz, (Not<float>*)&opNot, &opSugenoDefuzz );
	
	IsGaussian<float> poor(0,1.3);
	IsGaussian<float> good(5,1.3);
	IsGaussian<float> excellent(10,1.3);
	IsRamp<float> delicious(6, 9, IsRamp<float>::dir::Up);
	IsTrapeze<float> trap(0, 2, 4, 6, concavite::CONCAVE);
	IsRamp<float> rancid(1, 4, IsRamp<float>::dir::Down);
	IsTriangle<float> cheap(0, 5, 10);
	IsTriangle<float> average(7.5, 12.5, 17.5);
	IsTriangle<float> generous(15, 20, 25);
	ValueModel<float> tips(0);ValueModel<float> food(10);ValueModel<float> service(2);Expression<float>* t1 = f.newThen(f.newOr(f.newIs(&excellent, &service ),f.newIs(&delicious, &food )),f.newIs(&generous, &tips ));
	Expression<float>* t2 = f.newThen(f.newOr(f.newIs(&poor, &service ),f.newIs(&rancid, &food )),f.newIs(&cheap, &tips ));
	Expression<float>* t3 = f.newThen(f.newIs(&good, &service ),f.newIs(&average, &tips ));
	Expression<float>* a1 = f.newAgg(t1,t2);
	Expression<float>* r = f.newAgg(a1,t1);
	Expression<float>* system = f.newDefuzz(r,&tips);
	cout << "system ->" << system->evaluate()<< endl;
	return 0;
}


