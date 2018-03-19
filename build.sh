#!/usr/bin/env bash
java --add-modules java.xml.bind -cp cljs.jar:pushy-0.3.8.jar:src clojure.main build.clj
