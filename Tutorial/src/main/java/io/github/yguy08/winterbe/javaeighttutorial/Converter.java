package io.github.yguy08.winterbe.javaeighttutorial;

@FunctionalInterface
public interface Converter<F,T> {
	T convert(F from);
}
