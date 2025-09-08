package com.auyongjinyoo.salesforce.demo.salesforce.parser;

import org.apache.avro.generic.GenericData;

public record SfPlatformEvent(GenericData.Record payload) {
}
