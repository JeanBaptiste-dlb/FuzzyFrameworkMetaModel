#pragma once
#include "UnaryExpression.h"
namespace Core {
	template <class T>
	class UnaryShadowExpression: public UnaryExpression<T>
	{
	public:
		UnaryShadowExpression(UnaryExpression<T>*);
		virtual ~UnaryShadowExpression() {};
		virtual T evaluate(Expression<T>*)const;
		virtual void setTarget(UnaryExpression<T>* o);

	private:
		UnaryExpression<T>* target;
	};
	template <class T>
	UnaryShadowExpression<T>::UnaryShadowExpression(UnaryExpression<T>* _target): target(_target)
	{
	}

	template<class T>
	T UnaryShadowExpression<T>::evaluate(Expression<T>* o) const
	{
		if (target != nullptr) return target->evaluate(o);
	}

	template<class T>
	void UnaryShadowExpression<T>::setTarget(UnaryExpression<T>* o)
	{
		target = o;
	}

}