#pragma once
#include "Expression.h"

namespace Core {
	template <class T>
	class BinaryExpression
	{
	public:
		virtual T evaluate(Expression<T>*, Expression<T>*) const = 0;
	};
}