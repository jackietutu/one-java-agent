package com.alibaba.oneagent;

import java.lang.instrument.Instrumentation;

/**
 *
 * @author hengyunabc 2019-03-01
 *
 */
public interface PluginContext {

    Plugin getPlugin();

    String getProperty(String key);

    Instrumentation getInstrumentation();

}
