#pragma once
#include "Is.h"
#define _USE_MATH_DEFINES
#include <stdlib.h> 

#include<math.h>
using namespace Core;
namespace Fuzzy{
	template <class T>
	class IsGaussian :public Is<T> {
	public:
		IsGaussian(const T&, const T&);
		virtual T evaluate(Expression<T>*) const;
	private:
		T mid, phi;
	};
	template<class T>
	T IsGaussian<T>::evaluate(Expression<T>* o) const
	{
		T x = o->evaluate();
		return (1 / (phi * sqrt(2 * M_PI))) * exp(-(((x - mid)*(x - mid)) / ((phi) * (2 * phi))))/ (1 / (phi * sqrt(2 * M_PI))) * exp(-(((mid - mid) * (mid - mid)) / ((phi) * (2 * phi))));
	}
	template<class T>
	IsGaussian<T>::IsGaussian(const T& _mid, const T& _phi) : mid(_mid), phi(_phi)
	{
	}
}