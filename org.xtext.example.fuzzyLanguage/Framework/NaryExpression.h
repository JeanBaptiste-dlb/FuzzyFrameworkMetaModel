#pragma once
#include "Expression.h"
#include <vector> 
#include <iterator>

namespace Core {
	template <class T>
	class NaryExpression {
	public:
		virtual T evaluate(std::vector<Expression<T>*>) const = 0;
	};
}