#pragma once
#include "NaryExpression.h"

using namespace std;

namespace Core {
	template <class T>
	class NaryExpressionModel :public NaryExpression<T>, public Expression<T> {
	public:
		NaryExpressionModel(vector<Expression<T>*>, NaryExpression<T>*);
		virtual ~NaryExpressionModel() {};
		T evaluate() const;
		T evaluate(std::vector<Expression<T>*>) const;
		//std::vector<Expression<T>*> allocation(vector<Expression<T>*>);

	private:
		std::vector<Expression<T>*> operands;
		NaryExpression<T>* nary;
	};

	template <class T>
	NaryExpressionModel<T>::NaryExpressionModel(vector<Expression<T>*> _operands, NaryExpression<T>* _nary):operands(_operands), nary(_nary)
	{
	}

	/*template<class T>
	std::vector<Expression<T>*> NaryExpressionModel<T>::allocation(vector<Expression<T>*> tab) {
		const int taille = sizeof(tab) / sizeof(Expression<T>*);
		std::vector<Expression<T>*> c;
		for (unsigned int i = 0; i < taille; i++) {
			Expression<T>* tmp= &tab[i];
			c.push_back(tmp);
		}
		return c;
	}*/

	template <class T>
	T NaryExpressionModel<T>::evaluate() const{
		if (nary != nullptr) {
			return evaluate(operands);
		}
	}

	template<class T>
	T NaryExpressionModel<T>::evaluate(std::vector<Expression<T>*> operands) const{
		if (nary != nullptr) {
			return nary->evaluate(operands);
		}
		return T();
	}
}