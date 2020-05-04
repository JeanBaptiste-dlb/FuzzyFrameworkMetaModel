#pragma once
#include "MamdaniDefuzz.h"
#include "Evaluator.h"
#include "Expression.h"

using namespace Core;

namespace Fuzzy {
	template <class T>
	class CogDefuzz :public MamdaniDefuzz<T> {
	public:
		CogDefuzz(T, T, T);
		CogDefuzz();
		virtual T defuzz(typename Evaluator<T>::Shape*) const;
	};

	template<class T>
	CogDefuzz<T>::CogDefuzz(T _min, T _max, T _step) : MamdaniDefuzz<T>(_min, _max, _step)
	{
	}

	template<class T>
	CogDefuzz<T>::CogDefuzz() : MamdaniDefuzz<T>(0, 30, 0.01)
	{
	}

	template <class T>
	T CogDefuzz<T>::defuzz(typename Evaluator<T>::Shape* s) const
	{
		Evaluator<float> e = Evaluator<float>();
		vector<T> fi = s->first;
		vector<T> se = s->second;
		float den = 0, num = 0, count = 0;
		for (T val : se) {
			den += val;
			num += val * fi[count];
			count++;
		}
		e.PrintShape(cout, s);
		return num / den;

	}
}