#pragma once
#include "BinaryExpression.h"
#include "Expression.h"


namespace Core {
	template<class T>
	class BinaryExpressionModel :public BinaryExpression<T>, public Expression<T> {
	public:
		BinaryExpressionModel(Expression<T>*, Expression<T>*, BinaryExpression<T>*);
		virtual ~BinaryExpressionModel() {};
		virtual T evaluate() const;
		virtual T evaluate(Expression<T>*, Expression<T>*) const;
		virtual BinaryExpressionModel<T>* getOp();
	private:
		Expression<T> *left, *right;
		BinaryExpression<T>* op;
	};


	template<class T>
	BinaryExpressionModel<T>::BinaryExpressionModel(Expression<T>* _left, Expression<T>* _right, BinaryExpression<T>* _op): left(_left), right(_right), op(_op)
	{
	}

	template<class T>
	T BinaryExpressionModel<T>::evaluate() const
	{
		if (left != nullptr && right != nullptr) {
			return (evaluate(left, right));
		}
	}

	template<class T>
	T BinaryExpressionModel<T>::evaluate(Expression<T>* _left, Expression<T>* _right) const
	{
		if (op != nullptr) {
			return op->evaluate(_left, _right);
		}
	}

	template<class T>
	BinaryExpressionModel<T>* BinaryExpressionModel<T>::getOp() {
		return (BinaryExpressionModel<T> *) op;
	}

}
