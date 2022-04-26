package fr.insideapp.sonarqube.apple;

import org.junit.Test;
import org.sonar.api.Plugin;
import org.sonar.api.SonarEdition;
import org.sonar.api.SonarQubeSide;
import org.sonar.api.SonarRuntime;
import org.sonar.api.internal.SonarRuntimeImpl;
import org.sonar.api.utils.Version;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ApplePluginTest {

    @Test
    public void define() {

        SonarRuntime sonarRuntime = SonarRuntimeImpl.forSonarQube(Version.create(7, 9), SonarQubeSide.SERVER, SonarEdition.COMMUNITY);
        Plugin.Context context = new Plugin.Context(sonarRuntime);


        ApplePlugin plugin = new ApplePlugin();
        plugin.define(context);

        assertThat(context.getExtensions()).hasSize(20);


    }
}
