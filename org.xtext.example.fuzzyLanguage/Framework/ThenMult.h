#pragma once
#include "Then.h"

using namespace Core;

namespace Fuzzy {
	template <class T>
	class ThenMult :public Then<T> {
	public:
		ThenMult();
		virtual T evaluate(Expression<T>*, Expression<T>*) const;
	};

	template <class T>
	ThenMult<T>::ThenMult()
	{
	}

	template <class T>
	T ThenMult<T>::evaluate(Expression<T>* left, Expression<T>* right) const
	{
		T l = left->evaluate();
		T r = right->evaluate();

		return l * r;
	}
}
