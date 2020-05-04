#pragma once
#pragma once
#include "Is.h"
#define _USE_MATH_DEFINES
#include <stdlib.h> 

#include<math.h>
using namespace Core;
namespace Fuzzy {
	enum concavite
	{
		CONCAVE,CONVEXE
	};
	template <class T>
	class IsTrapeze :public Is<T> {
	public:
		IsTrapeze(const T&, const T&,const T&,const T&,concavite);
		virtual T evaluate(Expression<T>*) const;
	private:
		T min, left,right,max;
		concavite _concavite;
	};
	template<class T>
	T IsTrapeze<T>::evaluate(Expression<T>* o) const
	{
		if (_concavite == concavite::CONVEXE) {
			T x = o->evaluate();
			if (x < min || x>max) {
				return T(1);
			}
			if (x > left && x < right) {
				return T(0);
			}
			if (x < left) {
				return (x - left) / (min - left);
			}
			if (x > right) {
				return (x - right) / (max-right);
			}
		}
		if (_concavite == concavite::CONCAVE) {
			T x = o->evaluate();
			if (x < min || x>max) {
				return T(0);
			}
			if (x > left && x < right) {
				return T(1);
			}
			if (x < left) {
				return (x - min) / (left - min);
			}
			if (x > right) {
				return (x - max) / (right - max);
			}
		}
		
	}
	template<class T>
	IsTrapeze<T>::IsTrapeze(const T& _min, const T& _left, const T& _right, const T& _max, concavite __concavite) : min(_min), left(_left),right(_right),max(_max),_concavite(__concavite)
	{
	}
}