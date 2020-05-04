#pragma once
#include "Then.h"

using namespace Core;

namespace Fuzzy {
	template <class T>
	class AggPlus :public Then<T> {
	public:
		AggPlus();
		virtual T evaluate(Expression<T>*, Expression<T>*) const;
	};

	template <class T>
	AggPlus<T>::AggPlus()
	{
	}

	template <class T>
	T AggPlus<T>::evaluate(Expression<T>* left, Expression<T>* right) const
	{
		T l = left->evaluate();
		T r = right->evaluate();

		return l + r;
	}
}
