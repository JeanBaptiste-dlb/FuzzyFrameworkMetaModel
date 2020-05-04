#pragma once
#include "And.h"

using namespace Core;

namespace Fuzzy {
	template <class T>
	class AndMult :public And<T> {
	public:
		AndMult();
		virtual T evaluate(Expression<T>*, Expression<T>*) const;
	};

	template <class T>
	AndMult<T>::AndMult()
	{
	}

	template <class T>
	T AndMult<T>::evaluate(Expression<T>* left, Expression<T>* right) const
	{
		return left->evaluate() * right->evaluate();
	}
}