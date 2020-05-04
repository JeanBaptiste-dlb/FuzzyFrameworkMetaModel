#pragma once
#include "Or.h"

using namespace Core;

namespace Fuzzy {
	template <class T>
	class OrPlus :public Or<T> {
	public:
		OrPlus();
		virtual T evaluate(Expression<T>*, Expression<T>*) const;
	};

	template <class T>
	OrPlus<T>::OrPlus()
	{
	}

	template <class T>
	T OrPlus<T>::evaluate(Expression<T>* left, Expression<T>* right) const
	{
		T l = left->evaluate();
		T r = right->evaluate();
		
		return l + r;
	}
}