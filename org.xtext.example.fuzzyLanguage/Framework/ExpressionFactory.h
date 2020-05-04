#pragma once
#include "Expression.h"
#include "UnaryExpression.h"
#include "UnaryExpressionModel.h"
#include "BinaryExpression.h"
#include "BinaryExpressionModel.h"
#include "BinaryShadowExpression.h"
#include "UnaryShadowExpression.h"
#include "NaryExpression.h"
#include "NaryExpressionModel.h"
#include <set>
#include <list>

using namespace std;

namespace Core {
	template <class T>
	class ExpressionFactory {
	public:
		ExpressionFactory();
		virtual ~ExpressionFactory();
		Expression<T>* Hold(Expression<T>*);
		Expression<T>* newUnary(UnaryExpression<T>*, Expression<T>*);
		Expression<T>* newBinary(BinaryExpression<T>*, Expression<T>*, Expression<T>*);
		Expression<T>* newNary(NaryExpression<T>*, vector<Expression<T>*>);
	private:
		list<Expression<T>*> memory;
	};
	template<class T>
	ExpressionFactory<T>::ExpressionFactory(): memory(list<Expression<T>*>())
	{
	}
	template<class T>
	ExpressionFactory<T>::~ExpressionFactory()
	{
		memory.clear();
	}
	template<class T>
	Expression<T>* ExpressionFactory<T>::Hold(Expression<T>* exp)
	{
		memory.push_back(exp);
		return exp;
	}
	template<class T>
	Expression<T>* ExpressionFactory<T>::newUnary(UnaryExpression<T>* ope, Expression<T>* o)
	{
		return Hold((Expression<T>*)new UnaryExpressionModel<T>(o, ope));
	}
	template<class T>
	Expression<T>* ExpressionFactory<T>::newBinary(BinaryExpression<T>* ope, Expression<T>* l, Expression<T>* r)
	{
		return Hold((Expression<T>*)new BinaryExpressionModel<T>(l,r,ope));
	}
	template<class T>
	Expression<T>* ExpressionFactory<T>::newNary(NaryExpression<T>* ope, vector<Expression<T>*> os)
	{
		return Hold((Expression<T>*)new NaryExpressionModel<T>(os, ope));
	}
}