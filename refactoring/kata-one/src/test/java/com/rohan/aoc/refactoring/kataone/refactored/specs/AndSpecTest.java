package com.rohan.aoc.refactoring.kataone.refactored.specs;

import com.rohan.aoc.refactoring.kataone.refactored.RealEstate;
import com.rohan.aoc.refactoring.kataone.refactored.Spec;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AndSpecTest {

    @Mock
    private Spec yesSpec;

    @BeforeEach
    public void setup() {
        when(yesSpec.isSatisfiedBy(any(RealEstate.class)))
                .thenReturn(true);
    }

    @Test
    void shouldVerifyTwoComponentsInCaseOfYesResults() {
        // Given
        AndSpec andSpec = new AndSpec(yesSpec, yesSpec);

        // When
        boolean andResult = andSpec.isSatisfiedBy(mock(RealEstate.class));

        // Then
        assertThat(andResult).isTrue();
        verify(yesSpec, times(2))
                .isSatisfiedBy(any(RealEstate.class));
    }

    @Test
    void shouldVerifyThreeComponentsInCaseOfYesResults() {
        // Given
        AndSpec andSpec = new AndSpec(yesSpec, yesSpec, yesSpec);

        // When
        boolean andResult = andSpec.isSatisfiedBy(mock(RealEstate.class));

        // Then
        assertThat(andResult).isTrue();
        verify(yesSpec, times(3))
                .isSatisfiedBy(any(RealEstate.class));
    }
}