package library;

import io.micronaut.context.annotation.EachProperty;

@EachProperty("pets")
public interface PetConfiguration {

  String getName();

  String getBreed();

  String getColor();

}
