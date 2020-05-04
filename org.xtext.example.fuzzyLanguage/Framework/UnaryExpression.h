#pragma once
#include "Expression.h"

namespace Core {
	template <class T>
	class UnaryExpression
	{
	public:
		virtual T evaluate(Expression<T>*) const = 0; 
	};
}