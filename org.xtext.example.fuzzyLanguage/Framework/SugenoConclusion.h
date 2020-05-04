#pragma once
#include "NaryExpression.h"

using namespace Core;

namespace Fuzzy {
	template <class T>
	class SugenoConclusion :public NaryExpression<T> {
	public:
		SugenoConclusion(vector<T>);
		virtual ~SugenoConclusion() {};
		T evaluate(vector<Expression<T>*>) const;
		//vector<T> allocation(T[]);
		//void setCoeff(T[]);
	private:
		vector<T> coeff;
	};

	template<class T>
	SugenoConclusion<T>::SugenoConclusion(vector<T> _coeff) : coeff(_coeff)
	{
	}

	/*template<class T>
	vector<T> SugenoConclusion<T>::allocation(T _coeff[]) {
		const int taille = sizeof(*_coeff) / sizeof(T);
		vector<T> c;
		for (unsigned int i = 0; i < taille; i++) {
			c.push_back(_coeff[i]);
		}
		return c;
	}

	template<class T>
	void SugenoConclusion<T>::setCoeff(T _coeff[])
	{
		coeff = allocation(_coeff);
	}*/

	template<class T>
	T SugenoConclusion<T>::evaluate(vector<Expression<T>*> operands) const
	{
		if (operands.size()==coeff.size()-1)
		{
			T z(0);
			unsigned int i = 0;
			for (auto it = operands.begin(); it != operands.end(); it++){
				z += (*(*it)).evaluate() * coeff[i];
				i++;
			}
			z += coeff[i];
			return z;
		}
	}
}