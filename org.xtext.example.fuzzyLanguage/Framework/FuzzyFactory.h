#pragma once
#include "ExpressionFactory.h"
#include "BinaryShadowExpression.h"
#include "UnaryShadowExpression.h"
#include "NaryShadowExpression.h"
#include "Expression.h"
#include "And.h"
#include "Or.h"
#include "Then.h"
#include "Agg.h"
#include "MamdaniDefuzz.h"
#include "Not.h"
#include "Is.h"
#include "SugenoConclusion.h"
#include "SugenoDefuzz.h"
#include "SugenoThen.h"

using namespace Core;
using namespace std;

namespace Fuzzy{
	template <class T>
	class FuzzyFactory: public ExpressionFactory<T> {
	public :
		FuzzyFactory(And<T>*, Or<T>*, Then<T>*, Agg<T>*, CogDefuzz<T>*, Not<T>*, SugenoDefuzz<T>*);
		virtual ~FuzzyFactory() {};

		Expression<T>* newAnd(Expression<T>*, Expression<T>*);
		Expression<T>* newOr(Expression<T>*, Expression<T>*);
		Expression<T>* newThen(Expression<T>*, Expression<T>*);
		Expression<T>* newAgg(Expression<T>*, Expression<T>*);
		Expression<T>* newDefuzz(Expression<T>*, Expression<T>*);
		Expression<T>* newNot(Expression<T>*);
		Expression<T>* newIs(Is<T>*, Expression<T>*);
		Expression<T>* newSugenoThen(SugenoThen<T>*, Expression<T>*, Expression<T>*);
		Expression<T>* newSugenoConclusion(SugenoConclusion<T>*, vector<Expression<T>*>);
		Expression<T>* newSugenoDefuzz(vector<Expression<T>*>);

		void changeAnd(And<T>*);
		void changeOr(Or<T>*);
		void changeThen(Then<T>*);
		void changeAgg(Agg<T>*);
		void changeDefuzz(MamdaniDefuzz<T>*);
		void changeNot(Not<T>*);
		void changeSugenoDefuzz(SugenoDefuzz<T>*);

	private :
		BinaryShadowExpression<T> and_;
		BinaryShadowExpression<T> or_ ;
		BinaryShadowExpression<T> then;
		BinaryShadowExpression<T> agg;
		BinaryShadowExpression<T> defuzz;
		UnaryShadowExpression<T> not_;
		NaryShadowExpression<T> sugenoDefuzz;

	};

	template<class T>
	FuzzyFactory<T>::FuzzyFactory(And<T>* a, Or<T>* o, Then<T>* t, Agg<T>* ag, CogDefuzz<T>* d, Not<T>* n, SugenoDefuzz<T>* sD) :
		and_( BinaryShadowExpression<T>((BinaryExpression<T>*)a)), or_( BinaryShadowExpression<T>((BinaryExpression<T>*)o)), then( BinaryShadowExpression<T>((BinaryExpression<T>*)t)), agg( BinaryShadowExpression<T>((BinaryExpression<T>*)ag)), defuzz( BinaryShadowExpression<T>((BinaryExpression<T>*)d)), not_( UnaryShadowExpression<T>((UnaryExpression<T>*)n)), sugenoDefuzz( NaryShadowExpression<T>((NaryExpression<T>*)sD))
	{
	}

	template<class T>
	Expression<T>* FuzzyFactory<T>::newAnd(Expression<T>* l, Expression<T>* r)
	{
		return ExpressionFactory<T>::newBinary(&and_, l, r);
	}

	template<class T>
	Expression<T>* FuzzyFactory<T>::newOr(Expression<T>* l, Expression<T>* r)
	{
		return ExpressionFactory<T>::newBinary(&or_, l, r);
	}

	template<class T>
	Expression<T>* FuzzyFactory<T>::newThen(Expression<T>* l, Expression<T>* r)
	{
		return ExpressionFactory<T>::newBinary(&then, l, r);
	}

	template<class T>
	Expression<T>* FuzzyFactory<T>::newAgg(Expression<T>* l, Expression<T>* r)
	{
		return ExpressionFactory<T>::newBinary(&agg, l, r);
	}

	template<class T>
	Expression<T>* FuzzyFactory<T>::newDefuzz(Expression<T>* l, Expression<T>* r)
	{
		return ExpressionFactory<T>::newBinary(&defuzz, l, r);
	}

	template<class T>
	Expression<T>* FuzzyFactory<T>::newNot(Expression<T>* o)
	{
		return ExpressionFactory<T>::newUnary(&not_, o);
	}

	template<class T>
	Expression<T>* FuzzyFactory<T>::newIs(Is<T>* is_, Expression<T>* o)
	{
		return ExpressionFactory<T>::newUnary(is_, o);
	}

	template<class T>
	Expression<T>* FuzzyFactory<T>::newSugenoThen(SugenoThen<T>* s, Expression<T>*l, Expression<T>*r)
	{
		return ExpressionFactory<T>::newBinary(s, l, r);
	}

	template<class T>
	Expression<T>* FuzzyFactory<T>::newSugenoConclusion(SugenoConclusion<T>* s, vector<Expression<T>*> os)
	{
		return ExpressionFactory<T>::newNary(s, os);
	}

	template<class T>
	Expression<T>* FuzzyFactory<T>::newSugenoDefuzz(vector<Expression<T>*> os)
	{
		return ExpressionFactory<T>::newNary(&sugenoDefuzz, os);
	}

	template<class T>
	void FuzzyFactory<T>::changeAnd(And<T>* _and)
	{
		and_.setTarget(_and);
	}

	template<class T>
	void FuzzyFactory<T>::changeOr(Or<T>* _or)
	{
		or_.setTarget(_or);
	}

	template<class T>
	void FuzzyFactory<T>::changeThen(Then<T>* _then)
	{
		then.setTarget(_then);
	}

	template<class T>
	void FuzzyFactory<T>::changeAgg(Agg<T>* _agg)
	{
		agg.setTarget(_agg);
	}

	template<class T>
	void FuzzyFactory<T>::changeDefuzz(MamdaniDefuzz<T>* _defuzz)
	{
		defuzz.setTarget(_defuzz);
	}

	template<class T>
	void FuzzyFactory<T>::changeNot(Not<T>* _not)
	{
		not_.setTarget(_not);
	}

	template<class T>
	void Fuzzy::FuzzyFactory<T>::changeSugenoDefuzz(SugenoDefuzz<T>* sD)
	{
		sugenoDefuzz.setTarget(sD);
	}
}