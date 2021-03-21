package com.javacircle.unit.parameterized;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CustomArgumentProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        return Stream.of(
                Arguments.of(1, 4, 5),
                Arguments.of(5,8,9),
                Arguments.of(9,4,6)
        );
    }


}
