package net.byteflux.libby.relocation;

import java.nio.file.Path;
import java.util.Collection;

public interface RelocationHelper {

    /**
     * Invokes the jar relocator to process the input jar and generate an
     * output jar with the provided relocation rules applied.
     *
     * @param in          input jar
     * @param out         output jar
     * @param relocations relocations to apply
     */
    void relocate(Path in, Path out, Collection<Relocation> relocations);

}
