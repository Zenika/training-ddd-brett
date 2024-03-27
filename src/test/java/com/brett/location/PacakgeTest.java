package com.brett.location;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.junit.ArchTest;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class PacakgeTest {

    private final JavaClasses classes = new ClassFileImporter().importPackages(
            "com.brett.location.domains");

    @ArchTest
    public void validateDomainImport() {
        classes().that().resideInAnyPackage("..domain..")
                .should().n
    }

}
