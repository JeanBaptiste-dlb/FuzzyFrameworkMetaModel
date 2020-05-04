#pragma once
#include "And.h"

using namespace Core;

namespace Fuzzy {
	template <class T>
	class AndMin :public And<T> {
	public:
		AndMin();
		virtual T evaluate(Expression<T>*, Expression<T>*) const;
	};

	template <class T>
	AndMin<T>::AndMin()
	{
	}

	template <class T>
	T AndMin<T>::evaluate(Expression<T>* left, Expression<T>* right) const 
	{
		T l = left->evaluate();
		T r = right->evaluate();

		return (l < r) ? l : r;
	}
}