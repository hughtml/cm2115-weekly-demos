package uk.ac.rgu.topic5;

/**
 * An enumerated type (enum) to represent different operating systems
 */
public enum OperatingSystem {
    WINDOWS(11),
    MACOS(12),
    UBUNTU(20);

    /* 
     * The fields and methods below are defined for each individual value above.
     * Think of everything below this line as a template - a field, constructor and two methods
     * that all the values will have, and can independently use and (in the case of the field) updateHi H
     */

    /* A field representing the version - as and when a new version is rolled out, we can update this */
    private int version;

    /**
     * We define a constructor that requires all enum values (defined above) to pass an int parameter, describing their version number
     * We don't attach a visibility modifier because because it cannot be visible outside the enum (try making it public to see what happens)
     * @param version
     */
    OperatingSystem(int version){
        this.version = version;
    }

    /**
     * We can set each enum value's version independently - but the change will be reflected in all uses of that value
     * @param version
     */
    void setVersion(int version){
        this.version = version;
    }

    /**
     * Returns the version for each enum
     * @return
     */
    public int getVersion(){
        return this.version;
    }
}
