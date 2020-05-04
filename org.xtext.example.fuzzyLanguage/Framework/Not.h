#pragma once
#include "UnaryExpression.h"

using namespace Core;

namespace Fuzzy {
	template <class T>
	class Not : public UnaryExpression<T> {
	public:
		virtual T evaluate(Expression<T>*) const = 0;
	};
}
