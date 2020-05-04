#pragma once
#include "Is.h"
#include <stdlib.h> 
#include <iostream>

using namespace Core;

namespace Fuzzy {
	template <class T>
	class IsRamp :public Is<T> {
	public:
		enum dir {Up, Down};
		IsRamp(const T&, const T&, dir);
		virtual T evaluate(Expression<T>*) const;
	private:
		T min, max;
		dir direction;
	};

	template<class T>
	T IsRamp<T>::evaluate(Expression<T>* o) const
	{
		T x=o->evaluate();
		switch (direction)
		{
		case dir::Up:
			if(x<min){
				return T();
			}
			else if(x > max) {
				return T(1);
			}
			return (x-min)/(max-min);
			break;
		case dir::Down:
			if (x < min) {
				return T(1);
			}
			else if (x > max) {
				return T();
			}
			return 1 - (x - min) / (max - min);
			break;
		default:
			break;
		}
	}

	template<class T>
	IsRamp<T>::IsRamp(const T& _min, const T& _max, dir _direction) : min(_min), max(_max), direction(_direction)
	{
	}
}
