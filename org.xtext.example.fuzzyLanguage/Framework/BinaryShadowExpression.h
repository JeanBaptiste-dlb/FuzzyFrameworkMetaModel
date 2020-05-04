#pragma once
#include "BinaryExpression.h"

namespace Core {
	template <class T>
	class BinaryShadowExpression :public BinaryExpression<T> {
	public:
		BinaryShadowExpression(BinaryExpression<T>*);
		virtual ~BinaryShadowExpression() {};
		virtual T evaluate(Expression<T>*, Expression<T>*) const;
		virtual void setTarget(BinaryExpression<T>* o);
	private:
		BinaryExpression<T>* target;
	};
	template<class T>
	BinaryShadowExpression<T>::BinaryShadowExpression(BinaryExpression<T>*_target): target(_target)
	{
	}


	template<class T>
	T BinaryShadowExpression<T>::evaluate(Expression<T>* l, Expression<T>* r) const
	{
		if (target != nullptr) 
			return target->evaluate(l, r);
	}

	template<class T>
	void BinaryShadowExpression<T>::setTarget(BinaryExpression<T>* o)
	{
		target = o;
	}
}
