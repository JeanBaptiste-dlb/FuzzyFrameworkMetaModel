#pragma once
#include "Or.h"

using namespace Core;

namespace Fuzzy {
	template <class T>
	class OrMax :public Or<T> {
	public:
		OrMax();
		virtual T evaluate(Expression<T>*, Expression<T>*) const;
	};

	template <class T>
	OrMax<T>::OrMax()
	{
	}

	template <class T>
	T OrMax<T>::evaluate(Expression<T>* left, Expression<T>* right) const
	{
		T l = left->evaluate();
		T r = right->evaluate();
		
		return (l > r) ? l : r;
	}
}