#ifndef VALUE_H
#define VALUE_H

#include "Expression.h"

namespace Core {
	template <class T>
	class ValueModel :public Expression<T> {
	public:
		ValueModel();
		ValueModel(const T&);
		virtual ~ValueModel() {};

		virtual T evaluate() const;
		virtual void setValue(const T&);

	private:
		T value;
	};

	template <class T>
	ValueModel<T>::ValueModel() :value(T()) {};

	template <class T>
	ValueModel<T>::ValueModel(const T& v) :value(v) {};

	template<class T>
	T ValueModel<T>::evaluate() const
	{
		return value;
	}

	template <class T>
	void ValueModel<T>::setValue(const T& v) {
		value = v;
	};

}
#endif