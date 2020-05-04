#pragma once

#include "NaryExpression.h"
#include "SugenoConclusion.h"
#include "SugenoThen.h"
#include "BinaryExpressionModel.h"

using namespace Core;

namespace Fuzzy {
	template <class T>
	class SugenoDefuzz:public NaryExpression<T>
	{
	public:
		SugenoDefuzz();
		virtual~SugenoDefuzz() {};
		T evaluate(std::vector<Expression<T>*>) const;
	private:

	};

	template <class T>
	SugenoDefuzz<T>::SugenoDefuzz()
	{
	}

	template<class T>
	T SugenoDefuzz<T>::evaluate(std::vector<Expression<T>*> then_) const
	{
		T num(0), den(0);
		for (auto it = then_.begin(); it < then_.end(); it++){
			BinaryExpressionModel<T>* bem = (BinaryExpressionModel<T> *) (*it);
			num += bem->evaluate();
			SugenoThen<T>* sgt = ((SugenoThen<T> *) bem->getOp());
			den += sgt->premiseValue();
			/*std::cout << "den = " << den << std::endl;
			std::cout << "num = " << num << std::endl;*/
		}
		return num/den;
	}
}