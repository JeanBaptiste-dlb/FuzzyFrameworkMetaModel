#pragma once
#include "Then.h"

using namespace Core;

namespace Fuzzy {
	template <class T>
	class SugenoThen :public Then<T> {
	public:
		SugenoThen();
		SugenoThen(T);
		virtual T evaluate(Expression<T>*, Expression<T>*) const;
		virtual T premiseValue() const;

	private:
		mutable T PremiseValue;
	};

	template <class T>
	SugenoThen<T>::SugenoThen(T _PremiseValue): PremiseValue(_PremiseValue)
	{
	}

	template <class T>
	SugenoThen<T>::SugenoThen() : PremiseValue(T(0))
	{
	}

	template <class T>
	T SugenoThen<T>::evaluate(Expression<T>* left, Expression<T>* right) const
	{
		T l = left->evaluate();
		T r = right->evaluate();
		PremiseValue = l;
		//std::cout << "SugenoThen -> PremiseValue = " << premiseValue() << std::endl;
		return PremiseValue*r ;
	}
	template<class T>
	T SugenoThen<T>::premiseValue() const
	{
		return PremiseValue;
	}
}
