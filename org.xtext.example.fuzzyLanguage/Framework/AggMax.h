#pragma once
#include "Then.h"

using namespace Core;

namespace Fuzzy {
	template <class T>
	class AggMax :public Then<T> {
	public:
		AggMax();
		virtual T evaluate(Expression<T>*, Expression<T>*) const;
	};

	template <class T>
	AggMax<T>::AggMax()
	{
	}

	template <class T>
	T AggMax<T>::evaluate(Expression<T>* left, Expression<T>* right) const
	{
		T l = left->evaluate();
		T r = right->evaluate();

		return (l > r) ? l : r;
	}
}
