package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the {@code libs} extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final ComLibraryAccessors laccForComLibraryAccessors = new ComLibraryAccessors(owner);
    private final CommonsLibraryAccessors laccForCommonsLibraryAccessors = new CommonsLibraryAccessors(owner);
    private final IoLibraryAccessors laccForIoLibraryAccessors = new IoLibraryAccessors(owner);
    private final NetLibraryAccessors laccForNetLibraryAccessors = new NetLibraryAccessors(owner);
    private final OrgLibraryAccessors laccForOrgLibraryAccessors = new OrgLibraryAccessors(owner);
    private final OshiLibraryAccessors laccForOshiLibraryAccessors = new OshiLibraryAccessors(owner);
    private final TvLibraryAccessors laccForTvLibraryAccessors = new TvLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Group of libraries at <b>com</b>
     */
    public ComLibraryAccessors getCom() {
        return laccForComLibraryAccessors;
    }

    /**
     * Group of libraries at <b>commons</b>
     */
    public CommonsLibraryAccessors getCommons() {
        return laccForCommonsLibraryAccessors;
    }

    /**
     * Group of libraries at <b>io</b>
     */
    public IoLibraryAccessors getIo() {
        return laccForIoLibraryAccessors;
    }

    /**
     * Group of libraries at <b>net</b>
     */
    public NetLibraryAccessors getNet() {
        return laccForNetLibraryAccessors;
    }

    /**
     * Group of libraries at <b>org</b>
     */
    public OrgLibraryAccessors getOrg() {
        return laccForOrgLibraryAccessors;
    }

    /**
     * Group of libraries at <b>oshi</b>
     */
    public OshiLibraryAccessors getOshi() {
        return laccForOshiLibraryAccessors;
    }

    /**
     * Group of libraries at <b>tv</b>
     */
    public TvLibraryAccessors getTv() {
        return laccForTvLibraryAccessors;
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class ComLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleLibraryAccessors laccForComGoogleLibraryAccessors = new ComGoogleLibraryAccessors(owner);
        private final ComMojangLibraryAccessors laccForComMojangLibraryAccessors = new ComMojangLibraryAccessors(owner);
        private final ComPaulscodeLibraryAccessors laccForComPaulscodeLibraryAccessors = new ComPaulscodeLibraryAccessors(owner);

        public ComLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.google</b>
         */
        public ComGoogleLibraryAccessors getGoogle() {
            return laccForComGoogleLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.mojang</b>
         */
        public ComMojangLibraryAccessors getMojang() {
            return laccForComMojangLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.paulscode</b>
         */
        public ComPaulscodeLibraryAccessors getPaulscode() {
            return laccForComPaulscodeLibraryAccessors;
        }

    }

    public static class ComGoogleLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleCodeLibraryAccessors laccForComGoogleCodeLibraryAccessors = new ComGoogleCodeLibraryAccessors(owner);
        private final ComGoogleGuavaLibraryAccessors laccForComGoogleGuavaLibraryAccessors = new ComGoogleGuavaLibraryAccessors(owner);

        public ComGoogleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.google.code</b>
         */
        public ComGoogleCodeLibraryAccessors getCode() {
            return laccForComGoogleCodeLibraryAccessors;
        }

        /**
         * Group of libraries at <b>com.google.guava</b>
         */
        public ComGoogleGuavaLibraryAccessors getGuava() {
            return laccForComGoogleGuavaLibraryAccessors;
        }

    }

    public static class ComGoogleCodeLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleCodeGsonLibraryAccessors laccForComGoogleCodeGsonLibraryAccessors = new ComGoogleCodeGsonLibraryAccessors(owner);

        public ComGoogleCodeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.google.code.gson</b>
         */
        public ComGoogleCodeGsonLibraryAccessors getGson() {
            return laccForComGoogleCodeGsonLibraryAccessors;
        }

    }

    public static class ComGoogleCodeGsonLibraryAccessors extends SubDependencyFactory {

        public ComGoogleCodeGsonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>gson</b> with <b>com.google.code.gson:gson</b> coordinates and
         * with version reference <b>com.google.code.gson.gson</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGson() {
            return create("com.google.code.gson.gson");
        }

    }

    public static class ComGoogleGuavaLibraryAccessors extends SubDependencyFactory {

        public ComGoogleGuavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>guava</b> with <b>com.google.guava:guava</b> coordinates and
         * with version reference <b>com.google.guava.guava</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGuava() {
            return create("com.google.guava.guava");
        }

    }

    public static class ComMojangLibraryAccessors extends SubDependencyFactory {
        private final ComMojangIcu4jLibraryAccessors laccForComMojangIcu4jLibraryAccessors = new ComMojangIcu4jLibraryAccessors(owner);

        public ComMojangLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>authlib</b> with <b>com.mojang:authlib</b> coordinates and
         * with version reference <b>com.mojang.authlib</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAuthlib() {
            return create("com.mojang.authlib");
        }

        /**
         * Dependency provider for <b>patchy</b> with <b>com.mojang:patchy</b> coordinates and
         * with version reference <b>com.mojang.patchy</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPatchy() {
            return create("com.mojang.patchy");
        }

        /**
         * Group of libraries at <b>com.mojang.icu4j</b>
         */
        public ComMojangIcu4jLibraryAccessors getIcu4j() {
            return laccForComMojangIcu4jLibraryAccessors;
        }

    }

    public static class ComMojangIcu4jLibraryAccessors extends SubDependencyFactory {
        private final ComMojangIcu4jCoreLibraryAccessors laccForComMojangIcu4jCoreLibraryAccessors = new ComMojangIcu4jCoreLibraryAccessors(owner);

        public ComMojangIcu4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.mojang.icu4j.core</b>
         */
        public ComMojangIcu4jCoreLibraryAccessors getCore() {
            return laccForComMojangIcu4jCoreLibraryAccessors;
        }

    }

    public static class ComMojangIcu4jCoreLibraryAccessors extends SubDependencyFactory {

        public ComMojangIcu4jCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>mojang</b> with <b>com.mojang:icu4j-core-mojang</b> coordinates and
         * with version reference <b>com.mojang.icu4j.core.mojang</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMojang() {
            return create("com.mojang.icu4j.core.mojang");
        }

    }

    public static class ComPaulscodeLibraryAccessors extends SubDependencyFactory {
        private final ComPaulscodeSoundLibraryAccessors laccForComPaulscodeSoundLibraryAccessors = new ComPaulscodeSoundLibraryAccessors(owner);

        public ComPaulscodeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.paulscode.sound</b>
         */
        public ComPaulscodeSoundLibraryAccessors getSound() {
            return laccForComPaulscodeSoundLibraryAccessors;
        }

    }

    public static class ComPaulscodeSoundLibraryAccessors extends SubDependencyFactory {

        public ComPaulscodeSoundLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>codecjorbis</b> with <b>com.paulscode.sound:codecjorbis</b> coordinates and
         * with version reference <b>com.paulscode.sound.codecjorbis</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCodecjorbis() {
            return create("com.paulscode.sound.codecjorbis");
        }

        /**
         * Dependency provider for <b>codecwav</b> with <b>com.paulscode.sound:codecwav</b> coordinates and
         * with version reference <b>com.paulscode.sound.codecwav</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCodecwav() {
            return create("com.paulscode.sound.codecwav");
        }

        /**
         * Dependency provider for <b>libraryjavasound</b> with <b>com.paulscode.sound:libraryjavasound</b> coordinates and
         * with version reference <b>com.paulscode.sound.libraryjavasound</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLibraryjavasound() {
            return create("com.paulscode.sound.libraryjavasound");
        }

        /**
         * Dependency provider for <b>librarylwjglopenal</b> with <b>com.paulscode.sound:librarylwjglopenal</b> coordinates and
         * with version reference <b>com.paulscode.sound.librarylwjglopenal</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLibrarylwjglopenal() {
            return create("com.paulscode.sound.librarylwjglopenal");
        }

        /**
         * Dependency provider for <b>soundsystem</b> with <b>com.paulscode.sound:soundsystem</b> coordinates and
         * with version reference <b>com.paulscode.sound.soundsystem</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSoundsystem() {
            return create("com.paulscode.sound.soundsystem");
        }

    }

    public static class CommonsLibraryAccessors extends SubDependencyFactory {
        private final CommonsCodecLibraryAccessors laccForCommonsCodecLibraryAccessors = new CommonsCodecLibraryAccessors(owner);
        private final CommonsIoLibraryAccessors laccForCommonsIoLibraryAccessors = new CommonsIoLibraryAccessors(owner);
        private final CommonsLoggingLibraryAccessors laccForCommonsLoggingLibraryAccessors = new CommonsLoggingLibraryAccessors(owner);

        public CommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>commons.codec</b>
         */
        public CommonsCodecLibraryAccessors getCodec() {
            return laccForCommonsCodecLibraryAccessors;
        }

        /**
         * Group of libraries at <b>commons.io</b>
         */
        public CommonsIoLibraryAccessors getIo() {
            return laccForCommonsIoLibraryAccessors;
        }

        /**
         * Group of libraries at <b>commons.logging</b>
         */
        public CommonsLoggingLibraryAccessors getLogging() {
            return laccForCommonsLoggingLibraryAccessors;
        }

    }

    public static class CommonsCodecLibraryAccessors extends SubDependencyFactory {
        private final CommonsCodecCommonsLibraryAccessors laccForCommonsCodecCommonsLibraryAccessors = new CommonsCodecCommonsLibraryAccessors(owner);

        public CommonsCodecLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>commons.codec.commons</b>
         */
        public CommonsCodecCommonsLibraryAccessors getCommons() {
            return laccForCommonsCodecCommonsLibraryAccessors;
        }

    }

    public static class CommonsCodecCommonsLibraryAccessors extends SubDependencyFactory {

        public CommonsCodecCommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>codec</b> with <b>commons-codec:commons-codec</b> coordinates and
         * with version reference <b>commons.codec.commons.codec</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCodec() {
            return create("commons.codec.commons.codec");
        }

    }

    public static class CommonsIoLibraryAccessors extends SubDependencyFactory {
        private final CommonsIoCommonsLibraryAccessors laccForCommonsIoCommonsLibraryAccessors = new CommonsIoCommonsLibraryAccessors(owner);

        public CommonsIoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>commons.io.commons</b>
         */
        public CommonsIoCommonsLibraryAccessors getCommons() {
            return laccForCommonsIoCommonsLibraryAccessors;
        }

    }

    public static class CommonsIoCommonsLibraryAccessors extends SubDependencyFactory {

        public CommonsIoCommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>io</b> with <b>commons-io:commons-io</b> coordinates and
         * with version reference <b>commons.io.commons.io</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getIo() {
            return create("commons.io.commons.io");
        }

    }

    public static class CommonsLoggingLibraryAccessors extends SubDependencyFactory {
        private final CommonsLoggingCommonsLibraryAccessors laccForCommonsLoggingCommonsLibraryAccessors = new CommonsLoggingCommonsLibraryAccessors(owner);

        public CommonsLoggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>commons.logging.commons</b>
         */
        public CommonsLoggingCommonsLibraryAccessors getCommons() {
            return laccForCommonsLoggingCommonsLibraryAccessors;
        }

    }

    public static class CommonsLoggingCommonsLibraryAccessors extends SubDependencyFactory {

        public CommonsLoggingCommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>logging</b> with <b>commons-logging:commons-logging</b> coordinates and
         * with version reference <b>commons.logging.commons.logging</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLogging() {
            return create("commons.logging.commons.logging");
        }

    }

    public static class IoLibraryAccessors extends SubDependencyFactory {
        private final IoNettyLibraryAccessors laccForIoNettyLibraryAccessors = new IoNettyLibraryAccessors(owner);

        public IoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.netty</b>
         */
        public IoNettyLibraryAccessors getNetty() {
            return laccForIoNettyLibraryAccessors;
        }

    }

    public static class IoNettyLibraryAccessors extends SubDependencyFactory {
        private final IoNettyNettyLibraryAccessors laccForIoNettyNettyLibraryAccessors = new IoNettyNettyLibraryAccessors(owner);

        public IoNettyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.netty.netty</b>
         */
        public IoNettyNettyLibraryAccessors getNetty() {
            return laccForIoNettyNettyLibraryAccessors;
        }

    }

    public static class IoNettyNettyLibraryAccessors extends SubDependencyFactory {

        public IoNettyNettyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>all</b> with <b>io.netty:netty-all</b> coordinates and
         * with version reference <b>io.netty.netty.all</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAll() {
            return create("io.netty.netty.all");
        }

    }

    public static class NetLibraryAccessors extends SubDependencyFactory {
        private final NetJavaLibraryAccessors laccForNetJavaLibraryAccessors = new NetJavaLibraryAccessors(owner);
        private final NetSfLibraryAccessors laccForNetSfLibraryAccessors = new NetSfLibraryAccessors(owner);

        public NetLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>net.java</b>
         */
        public NetJavaLibraryAccessors getJava() {
            return laccForNetJavaLibraryAccessors;
        }

        /**
         * Group of libraries at <b>net.sf</b>
         */
        public NetSfLibraryAccessors getSf() {
            return laccForNetSfLibraryAccessors;
        }

    }

    public static class NetJavaLibraryAccessors extends SubDependencyFactory {
        private final NetJavaDevLibraryAccessors laccForNetJavaDevLibraryAccessors = new NetJavaDevLibraryAccessors(owner);
        private final NetJavaJinputLibraryAccessors laccForNetJavaJinputLibraryAccessors = new NetJavaJinputLibraryAccessors(owner);
        private final NetJavaJutilsLibraryAccessors laccForNetJavaJutilsLibraryAccessors = new NetJavaJutilsLibraryAccessors(owner);

        public NetJavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>net.java.dev</b>
         */
        public NetJavaDevLibraryAccessors getDev() {
            return laccForNetJavaDevLibraryAccessors;
        }

        /**
         * Group of libraries at <b>net.java.jinput</b>
         */
        public NetJavaJinputLibraryAccessors getJinput() {
            return laccForNetJavaJinputLibraryAccessors;
        }

        /**
         * Group of libraries at <b>net.java.jutils</b>
         */
        public NetJavaJutilsLibraryAccessors getJutils() {
            return laccForNetJavaJutilsLibraryAccessors;
        }

    }

    public static class NetJavaDevLibraryAccessors extends SubDependencyFactory {
        private final NetJavaDevJnaLibraryAccessors laccForNetJavaDevJnaLibraryAccessors = new NetJavaDevJnaLibraryAccessors(owner);

        public NetJavaDevLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>net.java.dev.jna</b>
         */
        public NetJavaDevJnaLibraryAccessors getJna() {
            return laccForNetJavaDevJnaLibraryAccessors;
        }

    }

    public static class NetJavaDevJnaLibraryAccessors extends SubDependencyFactory {

        public NetJavaDevJnaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jna</b> with <b>net.java.dev.jna:jna</b> coordinates and
         * with version reference <b>net.java.dev.jna.jna</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJna() {
            return create("net.java.dev.jna.jna");
        }

        /**
         * Dependency provider for <b>platform</b> with <b>net.java.dev.jna:platform</b> coordinates and
         * with version reference <b>net.java.dev.jna.platform</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPlatform() {
            return create("net.java.dev.jna.platform");
        }

    }

    public static class NetJavaJinputLibraryAccessors extends SubDependencyFactory {

        public NetJavaJinputLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jinput</b> with <b>net.java.jinput:jinput</b> coordinates and
         * with version reference <b>net.java.jinput.jinput</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJinput() {
            return create("net.java.jinput.jinput");
        }

    }

    public static class NetJavaJutilsLibraryAccessors extends SubDependencyFactory {

        public NetJavaJutilsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jutils</b> with <b>net.java.jutils:jutils</b> coordinates and
         * with version reference <b>net.java.jutils.jutils</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJutils() {
            return create("net.java.jutils.jutils");
        }

    }

    public static class NetSfLibraryAccessors extends SubDependencyFactory {
        private final NetSfJoptLibraryAccessors laccForNetSfJoptLibraryAccessors = new NetSfJoptLibraryAccessors(owner);

        public NetSfLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>net.sf.jopt</b>
         */
        public NetSfJoptLibraryAccessors getJopt() {
            return laccForNetSfJoptLibraryAccessors;
        }

    }

    public static class NetSfJoptLibraryAccessors extends SubDependencyFactory {
        private final NetSfJoptSimpleLibraryAccessors laccForNetSfJoptSimpleLibraryAccessors = new NetSfJoptSimpleLibraryAccessors(owner);

        public NetSfJoptLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>net.sf.jopt.simple</b>
         */
        public NetSfJoptSimpleLibraryAccessors getSimple() {
            return laccForNetSfJoptSimpleLibraryAccessors;
        }

    }

    public static class NetSfJoptSimpleLibraryAccessors extends SubDependencyFactory {
        private final NetSfJoptSimpleJoptLibraryAccessors laccForNetSfJoptSimpleJoptLibraryAccessors = new NetSfJoptSimpleJoptLibraryAccessors(owner);

        public NetSfJoptSimpleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>net.sf.jopt.simple.jopt</b>
         */
        public NetSfJoptSimpleJoptLibraryAccessors getJopt() {
            return laccForNetSfJoptSimpleJoptLibraryAccessors;
        }

    }

    public static class NetSfJoptSimpleJoptLibraryAccessors extends SubDependencyFactory {

        public NetSfJoptSimpleJoptLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>simple</b> with <b>net.sf.jopt-simple:jopt-simple</b> coordinates and
         * with version reference <b>net.sf.jopt.simple.jopt.simple</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSimple() {
            return create("net.sf.jopt.simple.jopt.simple");
        }

    }

    public static class OrgLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheLibraryAccessors laccForOrgApacheLibraryAccessors = new OrgApacheLibraryAccessors(owner);
        private final OrgLwjglLibraryAccessors laccForOrgLwjglLibraryAccessors = new OrgLwjglLibraryAccessors(owner);

        public OrgLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.apache</b>
         */
        public OrgApacheLibraryAccessors getApache() {
            return laccForOrgApacheLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.lwjgl</b>
         */
        public OrgLwjglLibraryAccessors getLwjgl() {
            return laccForOrgLwjglLibraryAccessors;
        }

    }

    public static class OrgApacheLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheCommonsLibraryAccessors laccForOrgApacheCommonsLibraryAccessors = new OrgApacheCommonsLibraryAccessors(owner);
        private final OrgApacheHttpcomponentsLibraryAccessors laccForOrgApacheHttpcomponentsLibraryAccessors = new OrgApacheHttpcomponentsLibraryAccessors(owner);
        private final OrgApacheLoggingLibraryAccessors laccForOrgApacheLoggingLibraryAccessors = new OrgApacheLoggingLibraryAccessors(owner);

        public OrgApacheLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.apache.commons</b>
         */
        public OrgApacheCommonsLibraryAccessors getCommons() {
            return laccForOrgApacheCommonsLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.apache.httpcomponents</b>
         */
        public OrgApacheHttpcomponentsLibraryAccessors getHttpcomponents() {
            return laccForOrgApacheHttpcomponentsLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.apache.logging</b>
         */
        public OrgApacheLoggingLibraryAccessors getLogging() {
            return laccForOrgApacheLoggingLibraryAccessors;
        }

    }

    public static class OrgApacheCommonsLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheCommonsCommonsLibraryAccessors laccForOrgApacheCommonsCommonsLibraryAccessors = new OrgApacheCommonsCommonsLibraryAccessors(owner);

        public OrgApacheCommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.apache.commons.commons</b>
         */
        public OrgApacheCommonsCommonsLibraryAccessors getCommons() {
            return laccForOrgApacheCommonsCommonsLibraryAccessors;
        }

    }

    public static class OrgApacheCommonsCommonsLibraryAccessors extends SubDependencyFactory {

        public OrgApacheCommonsCommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compress</b> with <b>org.apache.commons:commons-compress</b> coordinates and
         * with version reference <b>org.apache.commons.commons.compress</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCompress() {
            return create("org.apache.commons.commons.compress");
        }

        /**
         * Dependency provider for <b>lang3</b> with <b>org.apache.commons:commons-lang3</b> coordinates and
         * with version reference <b>org.apache.commons.commons.lang3</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLang3() {
            return create("org.apache.commons.commons.lang3");
        }

    }

    public static class OrgApacheHttpcomponentsLibraryAccessors extends SubDependencyFactory {

        public OrgApacheHttpcomponentsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>httpclient</b> with <b>org.apache.httpcomponents:httpclient</b> coordinates and
         * with version reference <b>org.apache.httpcomponents.httpclient</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHttpclient() {
            return create("org.apache.httpcomponents.httpclient");
        }

        /**
         * Dependency provider for <b>httpcore</b> with <b>org.apache.httpcomponents:httpcore</b> coordinates and
         * with version reference <b>org.apache.httpcomponents.httpcore</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHttpcore() {
            return create("org.apache.httpcomponents.httpcore");
        }

    }

    public static class OrgApacheLoggingLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheLoggingLog4jLibraryAccessors laccForOrgApacheLoggingLog4jLibraryAccessors = new OrgApacheLoggingLog4jLibraryAccessors(owner);

        public OrgApacheLoggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.apache.logging.log4j</b>
         */
        public OrgApacheLoggingLog4jLibraryAccessors getLog4j() {
            return laccForOrgApacheLoggingLog4jLibraryAccessors;
        }

    }

    public static class OrgApacheLoggingLog4jLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheLoggingLog4jLog4jLibraryAccessors laccForOrgApacheLoggingLog4jLog4jLibraryAccessors = new OrgApacheLoggingLog4jLog4jLibraryAccessors(owner);

        public OrgApacheLoggingLog4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.apache.logging.log4j.log4j</b>
         */
        public OrgApacheLoggingLog4jLog4jLibraryAccessors getLog4j() {
            return laccForOrgApacheLoggingLog4jLog4jLibraryAccessors;
        }

    }

    public static class OrgApacheLoggingLog4jLog4jLibraryAccessors extends SubDependencyFactory {

        public OrgApacheLoggingLog4jLog4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>org.apache.logging.log4j:log4j-api</b> coordinates and
         * with version reference <b>org.apache.logging.log4j.log4j.api</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApi() {
            return create("org.apache.logging.log4j.log4j.api");
        }

        /**
         * Dependency provider for <b>core</b> with <b>org.apache.logging.log4j:log4j-core</b> coordinates and
         * with version reference <b>org.apache.logging.log4j.log4j.core</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("org.apache.logging.log4j.log4j.core");
        }

    }

    public static class OrgLwjglLibraryAccessors extends SubDependencyFactory {

        public OrgLwjglLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>lwjgl</b> with <b>org.lwjgl:lwjgl</b> coordinates and
         * with version reference <b>org.lwjgl.lwjgl</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLwjgl() {
            return create("org.lwjgl.lwjgl");
        }

        /**
         * Dependency provider for <b>util</b> with <b>org.lwjgl:util</b> coordinates and
         * with version reference <b>org.lwjgl.util</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getUtil() {
            return create("org.lwjgl.util");
        }

    }

    public static class OshiLibraryAccessors extends SubDependencyFactory {
        private final OshiOshiLibraryAccessors laccForOshiOshiLibraryAccessors = new OshiOshiLibraryAccessors(owner);

        public OshiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>oshi.oshi</b>
         */
        public OshiOshiLibraryAccessors getOshi() {
            return laccForOshiOshiLibraryAccessors;
        }

    }

    public static class OshiOshiLibraryAccessors extends SubDependencyFactory {

        public OshiOshiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>oshi:oshi-core</b> coordinates and
         * with version reference <b>oshi.oshi.core</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("oshi.oshi.core");
        }

    }

    public static class TvLibraryAccessors extends SubDependencyFactory {
        private final TvTwitchLibraryAccessors laccForTvTwitchLibraryAccessors = new TvTwitchLibraryAccessors(owner);

        public TvLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>tv.twitch</b>
         */
        public TvTwitchLibraryAccessors getTwitch() {
            return laccForTvTwitchLibraryAccessors;
        }

    }

    public static class TvTwitchLibraryAccessors extends SubDependencyFactory {

        public TvTwitchLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>twitch</b> with <b>tv.twitch:twitch</b> coordinates and
         * with version reference <b>tv.twitch.twitch</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTwitch() {
            return create("tv.twitch.twitch");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final ComVersionAccessors vaccForComVersionAccessors = new ComVersionAccessors(providers, config);
        private final CommonsVersionAccessors vaccForCommonsVersionAccessors = new CommonsVersionAccessors(providers, config);
        private final IoVersionAccessors vaccForIoVersionAccessors = new IoVersionAccessors(providers, config);
        private final NetVersionAccessors vaccForNetVersionAccessors = new NetVersionAccessors(providers, config);
        private final OrgVersionAccessors vaccForOrgVersionAccessors = new OrgVersionAccessors(providers, config);
        private final OshiVersionAccessors vaccForOshiVersionAccessors = new OshiVersionAccessors(providers, config);
        private final TvVersionAccessors vaccForTvVersionAccessors = new TvVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com</b>
         */
        public ComVersionAccessors getCom() {
            return vaccForComVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.commons</b>
         */
        public CommonsVersionAccessors getCommons() {
            return vaccForCommonsVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.io</b>
         */
        public IoVersionAccessors getIo() {
            return vaccForIoVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.net</b>
         */
        public NetVersionAccessors getNet() {
            return vaccForNetVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org</b>
         */
        public OrgVersionAccessors getOrg() {
            return vaccForOrgVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.oshi</b>
         */
        public OshiVersionAccessors getOshi() {
            return vaccForOshiVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.tv</b>
         */
        public TvVersionAccessors getTv() {
            return vaccForTvVersionAccessors;
        }

    }

    public static class ComVersionAccessors extends VersionFactory  {

        private final ComGoogleVersionAccessors vaccForComGoogleVersionAccessors = new ComGoogleVersionAccessors(providers, config);
        private final ComMojangVersionAccessors vaccForComMojangVersionAccessors = new ComMojangVersionAccessors(providers, config);
        private final ComPaulscodeVersionAccessors vaccForComPaulscodeVersionAccessors = new ComPaulscodeVersionAccessors(providers, config);
        public ComVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.google</b>
         */
        public ComGoogleVersionAccessors getGoogle() {
            return vaccForComGoogleVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.com.mojang</b>
         */
        public ComMojangVersionAccessors getMojang() {
            return vaccForComMojangVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.com.paulscode</b>
         */
        public ComPaulscodeVersionAccessors getPaulscode() {
            return vaccForComPaulscodeVersionAccessors;
        }

    }

    public static class ComGoogleVersionAccessors extends VersionFactory  {

        private final ComGoogleCodeVersionAccessors vaccForComGoogleCodeVersionAccessors = new ComGoogleCodeVersionAccessors(providers, config);
        private final ComGoogleGuavaVersionAccessors vaccForComGoogleGuavaVersionAccessors = new ComGoogleGuavaVersionAccessors(providers, config);
        public ComGoogleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.google.code</b>
         */
        public ComGoogleCodeVersionAccessors getCode() {
            return vaccForComGoogleCodeVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.com.google.guava</b>
         */
        public ComGoogleGuavaVersionAccessors getGuava() {
            return vaccForComGoogleGuavaVersionAccessors;
        }

    }

    public static class ComGoogleCodeVersionAccessors extends VersionFactory  {

        private final ComGoogleCodeGsonVersionAccessors vaccForComGoogleCodeGsonVersionAccessors = new ComGoogleCodeGsonVersionAccessors(providers, config);
        public ComGoogleCodeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.google.code.gson</b>
         */
        public ComGoogleCodeGsonVersionAccessors getGson() {
            return vaccForComGoogleCodeGsonVersionAccessors;
        }

    }

    public static class ComGoogleCodeGsonVersionAccessors extends VersionFactory  {

        public ComGoogleCodeGsonVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>com.google.code.gson.gson</b> with value <b>2.2.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getGson() { return getVersion("com.google.code.gson.gson"); }

    }

    public static class ComGoogleGuavaVersionAccessors extends VersionFactory  {

        public ComGoogleGuavaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>com.google.guava.guava</b> with value <b>17.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getGuava() { return getVersion("com.google.guava.guava"); }

    }

    public static class ComMojangVersionAccessors extends VersionFactory  {

        private final ComMojangIcu4jVersionAccessors vaccForComMojangIcu4jVersionAccessors = new ComMojangIcu4jVersionAccessors(providers, config);
        public ComMojangVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>com.mojang.authlib</b> with value <b>1.5.21</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAuthlib() { return getVersion("com.mojang.authlib"); }

        /**
         * Version alias <b>com.mojang.patchy</b> with value <b>1.7.7</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getPatchy() { return getVersion("com.mojang.patchy"); }

        /**
         * Group of versions at <b>versions.com.mojang.icu4j</b>
         */
        public ComMojangIcu4jVersionAccessors getIcu4j() {
            return vaccForComMojangIcu4jVersionAccessors;
        }

    }

    public static class ComMojangIcu4jVersionAccessors extends VersionFactory  {

        private final ComMojangIcu4jCoreVersionAccessors vaccForComMojangIcu4jCoreVersionAccessors = new ComMojangIcu4jCoreVersionAccessors(providers, config);
        public ComMojangIcu4jVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.mojang.icu4j.core</b>
         */
        public ComMojangIcu4jCoreVersionAccessors getCore() {
            return vaccForComMojangIcu4jCoreVersionAccessors;
        }

    }

    public static class ComMojangIcu4jCoreVersionAccessors extends VersionFactory  {

        public ComMojangIcu4jCoreVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>com.mojang.icu4j.core.mojang</b> with value <b>51.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMojang() { return getVersion("com.mojang.icu4j.core.mojang"); }

    }

    public static class ComPaulscodeVersionAccessors extends VersionFactory  {

        private final ComPaulscodeSoundVersionAccessors vaccForComPaulscodeSoundVersionAccessors = new ComPaulscodeSoundVersionAccessors(providers, config);
        public ComPaulscodeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.paulscode.sound</b>
         */
        public ComPaulscodeSoundVersionAccessors getSound() {
            return vaccForComPaulscodeSoundVersionAccessors;
        }

    }

    public static class ComPaulscodeSoundVersionAccessors extends VersionFactory  {

        public ComPaulscodeSoundVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>com.paulscode.sound.codecjorbis</b> with value <b>20101023</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCodecjorbis() { return getVersion("com.paulscode.sound.codecjorbis"); }

        /**
         * Version alias <b>com.paulscode.sound.codecwav</b> with value <b>20101023</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCodecwav() { return getVersion("com.paulscode.sound.codecwav"); }

        /**
         * Version alias <b>com.paulscode.sound.libraryjavasound</b> with value <b>20101123</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLibraryjavasound() { return getVersion("com.paulscode.sound.libraryjavasound"); }

        /**
         * Version alias <b>com.paulscode.sound.librarylwjglopenal</b> with value <b>20100824</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLibrarylwjglopenal() { return getVersion("com.paulscode.sound.librarylwjglopenal"); }

        /**
         * Version alias <b>com.paulscode.sound.soundsystem</b> with value <b>20120107</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSoundsystem() { return getVersion("com.paulscode.sound.soundsystem"); }

    }

    public static class CommonsVersionAccessors extends VersionFactory  {

        private final CommonsCodecVersionAccessors vaccForCommonsCodecVersionAccessors = new CommonsCodecVersionAccessors(providers, config);
        private final CommonsIoVersionAccessors vaccForCommonsIoVersionAccessors = new CommonsIoVersionAccessors(providers, config);
        private final CommonsLoggingVersionAccessors vaccForCommonsLoggingVersionAccessors = new CommonsLoggingVersionAccessors(providers, config);
        public CommonsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.commons.codec</b>
         */
        public CommonsCodecVersionAccessors getCodec() {
            return vaccForCommonsCodecVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.commons.io</b>
         */
        public CommonsIoVersionAccessors getIo() {
            return vaccForCommonsIoVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.commons.logging</b>
         */
        public CommonsLoggingVersionAccessors getLogging() {
            return vaccForCommonsLoggingVersionAccessors;
        }

    }

    public static class CommonsCodecVersionAccessors extends VersionFactory  {

        private final CommonsCodecCommonsVersionAccessors vaccForCommonsCodecCommonsVersionAccessors = new CommonsCodecCommonsVersionAccessors(providers, config);
        public CommonsCodecVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.commons.codec.commons</b>
         */
        public CommonsCodecCommonsVersionAccessors getCommons() {
            return vaccForCommonsCodecCommonsVersionAccessors;
        }

    }

    public static class CommonsCodecCommonsVersionAccessors extends VersionFactory  {

        public CommonsCodecCommonsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>commons.codec.commons.codec</b> with value <b>1.9</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCodec() { return getVersion("commons.codec.commons.codec"); }

    }

    public static class CommonsIoVersionAccessors extends VersionFactory  {

        private final CommonsIoCommonsVersionAccessors vaccForCommonsIoCommonsVersionAccessors = new CommonsIoCommonsVersionAccessors(providers, config);
        public CommonsIoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.commons.io.commons</b>
         */
        public CommonsIoCommonsVersionAccessors getCommons() {
            return vaccForCommonsIoCommonsVersionAccessors;
        }

    }

    public static class CommonsIoCommonsVersionAccessors extends VersionFactory  {

        public CommonsIoCommonsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>commons.io.commons.io</b> with value <b>2.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getIo() { return getVersion("commons.io.commons.io"); }

    }

    public static class CommonsLoggingVersionAccessors extends VersionFactory  {

        private final CommonsLoggingCommonsVersionAccessors vaccForCommonsLoggingCommonsVersionAccessors = new CommonsLoggingCommonsVersionAccessors(providers, config);
        public CommonsLoggingVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.commons.logging.commons</b>
         */
        public CommonsLoggingCommonsVersionAccessors getCommons() {
            return vaccForCommonsLoggingCommonsVersionAccessors;
        }

    }

    public static class CommonsLoggingCommonsVersionAccessors extends VersionFactory  {

        public CommonsLoggingCommonsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>commons.logging.commons.logging</b> with value <b>1.1.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLogging() { return getVersion("commons.logging.commons.logging"); }

    }

    public static class IoVersionAccessors extends VersionFactory  {

        private final IoNettyVersionAccessors vaccForIoNettyVersionAccessors = new IoNettyVersionAccessors(providers, config);
        public IoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.io.netty</b>
         */
        public IoNettyVersionAccessors getNetty() {
            return vaccForIoNettyVersionAccessors;
        }

    }

    public static class IoNettyVersionAccessors extends VersionFactory  {

        private final IoNettyNettyVersionAccessors vaccForIoNettyNettyVersionAccessors = new IoNettyNettyVersionAccessors(providers, config);
        public IoNettyVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.io.netty.netty</b>
         */
        public IoNettyNettyVersionAccessors getNetty() {
            return vaccForIoNettyNettyVersionAccessors;
        }

    }

    public static class IoNettyNettyVersionAccessors extends VersionFactory  {

        public IoNettyNettyVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>io.netty.netty.all</b> with value <b>4.0.23.Final</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAll() { return getVersion("io.netty.netty.all"); }

    }

    public static class NetVersionAccessors extends VersionFactory  {

        private final NetJavaVersionAccessors vaccForNetJavaVersionAccessors = new NetJavaVersionAccessors(providers, config);
        private final NetSfVersionAccessors vaccForNetSfVersionAccessors = new NetSfVersionAccessors(providers, config);
        public NetVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.net.java</b>
         */
        public NetJavaVersionAccessors getJava() {
            return vaccForNetJavaVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.net.sf</b>
         */
        public NetSfVersionAccessors getSf() {
            return vaccForNetSfVersionAccessors;
        }

    }

    public static class NetJavaVersionAccessors extends VersionFactory  {

        private final NetJavaDevVersionAccessors vaccForNetJavaDevVersionAccessors = new NetJavaDevVersionAccessors(providers, config);
        private final NetJavaJinputVersionAccessors vaccForNetJavaJinputVersionAccessors = new NetJavaJinputVersionAccessors(providers, config);
        private final NetJavaJutilsVersionAccessors vaccForNetJavaJutilsVersionAccessors = new NetJavaJutilsVersionAccessors(providers, config);
        public NetJavaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.net.java.dev</b>
         */
        public NetJavaDevVersionAccessors getDev() {
            return vaccForNetJavaDevVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.net.java.jinput</b>
         */
        public NetJavaJinputVersionAccessors getJinput() {
            return vaccForNetJavaJinputVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.net.java.jutils</b>
         */
        public NetJavaJutilsVersionAccessors getJutils() {
            return vaccForNetJavaJutilsVersionAccessors;
        }

    }

    public static class NetJavaDevVersionAccessors extends VersionFactory  {

        private final NetJavaDevJnaVersionAccessors vaccForNetJavaDevJnaVersionAccessors = new NetJavaDevJnaVersionAccessors(providers, config);
        public NetJavaDevVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.net.java.dev.jna</b>
         */
        public NetJavaDevJnaVersionAccessors getJna() {
            return vaccForNetJavaDevJnaVersionAccessors;
        }

    }

    public static class NetJavaDevJnaVersionAccessors extends VersionFactory  {

        public NetJavaDevJnaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>net.java.dev.jna.jna</b> with value <b>3.4.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJna() { return getVersion("net.java.dev.jna.jna"); }

        /**
         * Version alias <b>net.java.dev.jna.platform</b> with value <b>3.4.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getPlatform() { return getVersion("net.java.dev.jna.platform"); }

    }

    public static class NetJavaJinputVersionAccessors extends VersionFactory  {

        public NetJavaJinputVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>net.java.jinput.jinput</b> with value <b>2.0.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJinput() { return getVersion("net.java.jinput.jinput"); }

    }

    public static class NetJavaJutilsVersionAccessors extends VersionFactory  {

        public NetJavaJutilsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>net.java.jutils.jutils</b> with value <b>1.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJutils() { return getVersion("net.java.jutils.jutils"); }

    }

    public static class NetSfVersionAccessors extends VersionFactory  {

        private final NetSfJoptVersionAccessors vaccForNetSfJoptVersionAccessors = new NetSfJoptVersionAccessors(providers, config);
        public NetSfVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.net.sf.jopt</b>
         */
        public NetSfJoptVersionAccessors getJopt() {
            return vaccForNetSfJoptVersionAccessors;
        }

    }

    public static class NetSfJoptVersionAccessors extends VersionFactory  {

        private final NetSfJoptSimpleVersionAccessors vaccForNetSfJoptSimpleVersionAccessors = new NetSfJoptSimpleVersionAccessors(providers, config);
        public NetSfJoptVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.net.sf.jopt.simple</b>
         */
        public NetSfJoptSimpleVersionAccessors getSimple() {
            return vaccForNetSfJoptSimpleVersionAccessors;
        }

    }

    public static class NetSfJoptSimpleVersionAccessors extends VersionFactory  {

        private final NetSfJoptSimpleJoptVersionAccessors vaccForNetSfJoptSimpleJoptVersionAccessors = new NetSfJoptSimpleJoptVersionAccessors(providers, config);
        public NetSfJoptSimpleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.net.sf.jopt.simple.jopt</b>
         */
        public NetSfJoptSimpleJoptVersionAccessors getJopt() {
            return vaccForNetSfJoptSimpleJoptVersionAccessors;
        }

    }

    public static class NetSfJoptSimpleJoptVersionAccessors extends VersionFactory  {

        public NetSfJoptSimpleJoptVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>net.sf.jopt.simple.jopt.simple</b> with value <b>4.6</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSimple() { return getVersion("net.sf.jopt.simple.jopt.simple"); }

    }

    public static class OrgVersionAccessors extends VersionFactory  {

        private final OrgApacheVersionAccessors vaccForOrgApacheVersionAccessors = new OrgApacheVersionAccessors(providers, config);
        private final OrgLwjglVersionAccessors vaccForOrgLwjglVersionAccessors = new OrgLwjglVersionAccessors(providers, config);
        public OrgVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.apache</b>
         */
        public OrgApacheVersionAccessors getApache() {
            return vaccForOrgApacheVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.lwjgl</b>
         */
        public OrgLwjglVersionAccessors getLwjgl() {
            return vaccForOrgLwjglVersionAccessors;
        }

    }

    public static class OrgApacheVersionAccessors extends VersionFactory  {

        private final OrgApacheCommonsVersionAccessors vaccForOrgApacheCommonsVersionAccessors = new OrgApacheCommonsVersionAccessors(providers, config);
        private final OrgApacheHttpcomponentsVersionAccessors vaccForOrgApacheHttpcomponentsVersionAccessors = new OrgApacheHttpcomponentsVersionAccessors(providers, config);
        private final OrgApacheLoggingVersionAccessors vaccForOrgApacheLoggingVersionAccessors = new OrgApacheLoggingVersionAccessors(providers, config);
        public OrgApacheVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.apache.commons</b>
         */
        public OrgApacheCommonsVersionAccessors getCommons() {
            return vaccForOrgApacheCommonsVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.apache.httpcomponents</b>
         */
        public OrgApacheHttpcomponentsVersionAccessors getHttpcomponents() {
            return vaccForOrgApacheHttpcomponentsVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.apache.logging</b>
         */
        public OrgApacheLoggingVersionAccessors getLogging() {
            return vaccForOrgApacheLoggingVersionAccessors;
        }

    }

    public static class OrgApacheCommonsVersionAccessors extends VersionFactory  {

        private final OrgApacheCommonsCommonsVersionAccessors vaccForOrgApacheCommonsCommonsVersionAccessors = new OrgApacheCommonsCommonsVersionAccessors(providers, config);
        public OrgApacheCommonsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.apache.commons.commons</b>
         */
        public OrgApacheCommonsCommonsVersionAccessors getCommons() {
            return vaccForOrgApacheCommonsCommonsVersionAccessors;
        }

    }

    public static class OrgApacheCommonsCommonsVersionAccessors extends VersionFactory  {

        public OrgApacheCommonsCommonsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.apache.commons.commons.compress</b> with value <b>1.8.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCompress() { return getVersion("org.apache.commons.commons.compress"); }

        /**
         * Version alias <b>org.apache.commons.commons.lang3</b> with value <b>3.3.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLang3() { return getVersion("org.apache.commons.commons.lang3"); }

    }

    public static class OrgApacheHttpcomponentsVersionAccessors extends VersionFactory  {

        public OrgApacheHttpcomponentsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.apache.httpcomponents.httpclient</b> with value <b>4.3.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getHttpclient() { return getVersion("org.apache.httpcomponents.httpclient"); }

        /**
         * Version alias <b>org.apache.httpcomponents.httpcore</b> with value <b>4.3.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getHttpcore() { return getVersion("org.apache.httpcomponents.httpcore"); }

    }

    public static class OrgApacheLoggingVersionAccessors extends VersionFactory  {

        private final OrgApacheLoggingLog4jVersionAccessors vaccForOrgApacheLoggingLog4jVersionAccessors = new OrgApacheLoggingLog4jVersionAccessors(providers, config);
        public OrgApacheLoggingVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.apache.logging.log4j</b>
         */
        public OrgApacheLoggingLog4jVersionAccessors getLog4j() {
            return vaccForOrgApacheLoggingLog4jVersionAccessors;
        }

    }

    public static class OrgApacheLoggingLog4jVersionAccessors extends VersionFactory  {

        private final OrgApacheLoggingLog4jLog4jVersionAccessors vaccForOrgApacheLoggingLog4jLog4jVersionAccessors = new OrgApacheLoggingLog4jLog4jVersionAccessors(providers, config);
        public OrgApacheLoggingLog4jVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.apache.logging.log4j.log4j</b>
         */
        public OrgApacheLoggingLog4jLog4jVersionAccessors getLog4j() {
            return vaccForOrgApacheLoggingLog4jLog4jVersionAccessors;
        }

    }

    public static class OrgApacheLoggingLog4jLog4jVersionAccessors extends VersionFactory  {

        public OrgApacheLoggingLog4jLog4jVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.apache.logging.log4j.log4j.api</b> with value <b>2.0-beta9</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getApi() { return getVersion("org.apache.logging.log4j.log4j.api"); }

        /**
         * Version alias <b>org.apache.logging.log4j.log4j.core</b> with value <b>2.0-beta9</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCore() { return getVersion("org.apache.logging.log4j.log4j.core"); }

    }

    public static class OrgLwjglVersionAccessors extends VersionFactory  {

        public OrgLwjglVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.lwjgl.lwjgl</b> with value <b>2.9.4-nightly</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLwjgl() { return getVersion("org.lwjgl.lwjgl"); }

        /**
         * Version alias <b>org.lwjgl.util</b> with value <b>2.9.4-nightly</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getUtil() { return getVersion("org.lwjgl.util"); }

    }

    public static class OshiVersionAccessors extends VersionFactory  {

        private final OshiOshiVersionAccessors vaccForOshiOshiVersionAccessors = new OshiOshiVersionAccessors(providers, config);
        public OshiVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.oshi.oshi</b>
         */
        public OshiOshiVersionAccessors getOshi() {
            return vaccForOshiOshiVersionAccessors;
        }

    }

    public static class OshiOshiVersionAccessors extends VersionFactory  {

        public OshiOshiVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>oshi.oshi.core</b> with value <b>1.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCore() { return getVersion("oshi.oshi.core"); }

    }

    public static class TvVersionAccessors extends VersionFactory  {

        private final TvTwitchVersionAccessors vaccForTvTwitchVersionAccessors = new TvTwitchVersionAccessors(providers, config);
        public TvVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.tv.twitch</b>
         */
        public TvTwitchVersionAccessors getTwitch() {
            return vaccForTvTwitchVersionAccessors;
        }

    }

    public static class TvTwitchVersionAccessors extends VersionFactory  {

        public TvTwitchVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>tv.twitch.twitch</b> with value <b>6.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getTwitch() { return getVersion("tv.twitch.twitch"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
