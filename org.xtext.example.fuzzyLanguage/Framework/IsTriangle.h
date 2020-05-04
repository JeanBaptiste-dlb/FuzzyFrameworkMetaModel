#pragma once
#include "Is.h"
#include <stdlib.h> 

using namespace Core;

namespace Fuzzy {
	template <class T>
	class IsTriangle :public Is<T> {
	public:
		IsTriangle(const T&, const T&, const T&);
		virtual T evaluate(Expression<T>*) const;
	private:
		T min, mid, max;
	};
	template<class T>
	T IsTriangle<T>::evaluate(Expression<T>* o) const
	{
		T x = o->evaluate();
		if (x <= min || x >= max)
			return 0;
		return
			(x <= mid) ?
			(x - min) / (mid - min) :
			(max - x) / (max - mid);
	}
	template<class T>
	IsTriangle<T>::IsTriangle(const T& _min, const T& _mid, const T& _max): min(_min), mid(_mid), max(_max)
	{
	}
}
