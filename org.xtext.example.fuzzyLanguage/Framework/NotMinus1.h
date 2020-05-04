#pragma once
#include "Not.h"

using namespace Core;

namespace Fuzzy {
	template <class T>
	class NotMinus1 : public Not<T>
	{
	public:
		NotMinus1();
		~NotMinus1() {};
		T evaluate(Expression<T>*) const;

	private:

	};

	template<class T>
	NotMinus1<T>::NotMinus1()
	{
	}

	template<class T>
	T NotMinus1<T>::evaluate(Expression<T>* o)const
	{
		return 1 - o->evaluate();
	}
}