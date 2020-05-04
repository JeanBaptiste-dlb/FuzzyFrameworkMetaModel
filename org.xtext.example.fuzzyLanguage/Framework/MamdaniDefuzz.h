#pragma once
#include "BinaryExpression.h"
#include "Evaluator.h"

using namespace Core;

namespace Fuzzy {
	template <class T>
	class MamdaniDefuzz :public BinaryExpression<T> {
	public:
		MamdaniDefuzz(T, T, T);
		virtual ~MamdaniDefuzz() {};
		virtual T evaluate(Expression<T>*, Expression<T>*) const;
		virtual T defuzz(typename Evaluator<T>::Shape*) const = 0;
	private:
		T min, max, step;
	};
	template<class T>
	MamdaniDefuzz<T>::MamdaniDefuzz(T _min,T _max,T _step): min(_min), max(_max), step(_step)
	{
	}
	template<class T>
	T MamdaniDefuzz<T>::evaluate(Expression<T>* f, Expression<T>* exp) const
	{
		return defuzz(new typename Evaluator<T>::Shape (Evaluator<T>::BuildShape(min ,max ,step ,f , exp )));
	}
}