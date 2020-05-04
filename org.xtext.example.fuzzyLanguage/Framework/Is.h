#pragma once
#include "UnaryExpression.h"

namespace Fuzzy {
	template <class T>
	class Is :public UnaryExpression<T> {
	public:
		virtual T evaluate(Expression<T>*) const = 0;
	};
}
