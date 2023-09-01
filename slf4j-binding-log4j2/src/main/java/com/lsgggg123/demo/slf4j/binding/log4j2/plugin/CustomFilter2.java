package com.lsgggg123.demo.slf4j.binding.log4j2.plugin;

import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.Node;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginBuilderFactory;
import org.apache.logging.log4j.core.filter.AbstractFilter;

@Plugin(name = "CustomFilter2", category = Node.CATEGORY, elementType = Filter.ELEMENT_TYPE, printObject = true)
public class CustomFilter2 extends AbstractFilter {
    @Override
    public Result filter(LogEvent event) {
        return super.filter(event);
    }

    @PluginBuilderFactory
    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder extends AbstractFilterBuilder<Builder>
            implements org.apache.logging.log4j.core.util.Builder<CustomFilter2> {

        @Override
        public CustomFilter2 build() {
            return new CustomFilter2();
        }
    }
}