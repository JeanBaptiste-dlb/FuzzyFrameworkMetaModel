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
	NotMinus1<float> opNot;
	AndMin<float> opAnd;
	OrMax<float> opOr;
	ThenMin<float> opThen;
	CogDefuzz<float> opDefuzz (0,20,0.1);
	AggMax<float> opAgg;
	SugenoDefuzz<float> opSugenoDefuzz;	
	FuzzyFactory<float> f((And<float>*) &opAnd, (Or<float>*)&opOr, (Then<float>*)&opThen, (Agg<float>*)&opAgg, &opDefuzz, (Not<float>*)&opNot, &opSugenoDefuzz );
	
	ValueModel<float> group(4);IsTriangle<float> small_size(0, 1.5, 3);
	IsTriangle<float> medium_size(3, 4, 5);
	IsTriangle<float> big_size(5, 6.5, 8);
	ValueModel<float> quality(17);IsRamp<float> unsatisfying(3, 10, IsRamp<float>::dir::Down);
	IsTrapeze<float> good(5, 8, 12, 15, concavite::CONCAVE);
	IsRamp<float> excellent(10, 17, IsRamp<float>::dir::Up);
	ValueModel<float> generosity(20);IsGaussian<float> average(10,0.35);
	IsGaussian<float> generous(20,0.25);
	ValueModel<float> mark(20);IsTriangle<float> low(0, 5, 10);
	IsTriangle<float> medium(5, 10, 15);
	IsTriangle<float> high(10, 15, 20);
	Expression<float>* t1 = f.newThen(f.newOr(f.newIs(&big_size, &group ),f.newIs(&unsatisfying, &quality )),f.newIs(&low, &mark ));
	Expression<float>* t2 = f.newThen(f.newOr(f.newIs(&small_size, &group ),f.newOr(f.newIs(&good, &quality ),f.newIs(&average, &generosity ))),f.newIs(&medium, &mark ));
	Expression<float>* t3 = f.newThen(f.newOr(f.newIs(&medium_size, &group ),f.newOr(f.newIs(&excellent, &quality ),f.newIs(&generous, &generosity ))),f.newIs(&high, &mark ));
	Expression<float>* a1 = f.newAgg(t1,t2);
	Expression<float>* r = f.newAgg(a1,t3);
	Expression<float>* system = f.newDefuzz(r,&mark);
	cout << "system ->" << system->evaluate()<< endl;
	return 0;
}


