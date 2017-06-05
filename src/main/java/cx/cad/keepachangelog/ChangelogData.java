package cx.cad.keepachangelog;

import java.util.HashSet;
import java.util.Set;

public class ChangelogData {
    private String projectName = "";
    private String description = "";
    private Set<ChangelogEntry> entries = new HashSet<ChangelogEntry>(); //XXX this should be an ordered set


    public ChangelogData(String projectName, String description, Set<ChangelogEntry> entries) {
        this.projectName = projectName;
        this.description = description;
        this.entries.addAll(entries);
    }

    public String getProjectName() {
        return projectName;
    }
    public String getDescription() {
        return description;
    }
    public Set<ChangelogEntry> getEntries() {
        return entries;
    }
}
