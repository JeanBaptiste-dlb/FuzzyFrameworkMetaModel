#pragma once
#include "Then.h"

using namespace Core;

namespace Fuzzy {
	template <class T>
	class ThenMin :public Then<T> {
	public:
		ThenMin();
		virtual T evaluate(Expression<T>*, Expression<T>*) const;
	};

	template <class T>
	ThenMin<T>::ThenMin()
	{
	}

	template <class T>
	T ThenMin<T>::evaluate(Expression<T>* left, Expression<T>* right) const
	{
		T l = left->evaluate();
		T r = right->evaluate();

		return (l < r) ? l : r;
	}
}
