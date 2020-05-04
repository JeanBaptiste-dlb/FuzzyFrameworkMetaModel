#pragma once
#include "UnaryExpression.h"
#include "Expression.h"


namespace Core {
	template<class T>
	class UnaryExpressionModel :public UnaryExpression<T>, public Expression<T> {
	public:
		UnaryExpressionModel(Expression<T>*, UnaryExpression<T>*);
		virtual ~UnaryExpressionModel() {};
		virtual T evaluate() const;
		virtual T evaluate(Expression<T>*) const;
	private:
		Expression<T>* operand;
		UnaryExpression<T>* op;
	};


	template<class T>
	UnaryExpressionModel<T>::UnaryExpressionModel(Expression<T>* _operand, UnaryExpression<T>* _op): operand(_operand), op(_op)
	{
	}

	template<class T>
	T UnaryExpressionModel<T>::evaluate() const
	{
		if (operand != nullptr) {
			return (evaluate(operand));
		}
	}

	template<class T>
	T UnaryExpressionModel<T>::evaluate(Expression<T>* o) const
	{
		if (op != nullptr) {
			return op->evaluate(o);
		}
	}

}
