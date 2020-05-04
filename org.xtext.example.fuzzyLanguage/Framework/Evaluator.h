#pragma once
#include <vector>
#include <iostream>
#include "Expression.h"
#include "UnaryExpression.h"
#include "ValueModel.h"
using namespace std;
using namespace Core;
template <class T>
class Evaluator
{
public:
	typedef pair<vector<T>, vector<T> > Shape;
	static Shape BuildShape(const T& min, const T& max, const T& step, Expression<T>* f, Expression<T>* exp);
	static ostream& PrintShape(ostream&, const Shape* s);
};
template <class T>
typename Evaluator<T>::Shape Evaluator<T>::BuildShape(const T& min, const T& max, const T& step, Expression<T>* f, Expression<T>* exp)
{
	ValueModel<T>* e = (ValueModel<T>*) exp;
	UnaryExpression<T>* ue = (UnaryExpression<T>*) f;
	vector<T> x, y;
	for (T i = min; i < max; i += step) {
		e->setValue(i);
		x.push_back(e->evaluate());
		y.push_back((ue->evaluate(e)));
	}
	return Shape(x, y);
}
template<class T>
ostream& Evaluator<T>::PrintShape(ostream& os, const Shape* s)
{
	os << '[';
	typename vector<T>::const_iterator it = s->first.begin();
	for (; it != s->first.end(); ++it)
		os << *it << ", ";
	os << ']';
	os << endl;
	os << '[';
	it = s->second.begin();
	for (; it != s->second.end(); ++it)
		os << *it << ", ";
	os << ']';
	return os;
}