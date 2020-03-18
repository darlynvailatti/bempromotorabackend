package br.com.bempromotora.backend.rest.pattern;

public interface RestConverter<Input,Output> {

    public Output convert(Input input);

}
