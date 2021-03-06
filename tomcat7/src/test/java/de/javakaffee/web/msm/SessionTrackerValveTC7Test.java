/*
 * Copyright 2009 Martin Grotzke
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package de.javakaffee.web.msm;

import java.util.concurrent.atomic.AtomicBoolean;

import javax.annotation.Nonnull;

import org.apache.catalina.Context;
import org.apache.catalina.core.ApplicationSessionCookieConfig;
import org.testng.annotations.Test;

/**
 * Test the {@link SessionTrackerValveTC7}.
 *
 * @author <a href="mailto:martin.grotzke@javakaffee.de">Martin Grotzke</a>
 * @version $Id$
 */
@Test
public class SessionTrackerValveTC7Test extends SessionTrackerValveTest {
    
    @Override
    protected SessionTrackerValve createSessionTrackerValve( @Nonnull final Context context ) {
        return new SessionTrackerValveTC7( null, context, _service, Statistics.create(), new AtomicBoolean( true ) );
    }
    
    @Override
    protected String getGlobalSessionCookieName( @Nonnull final Context context ) {
        return ApplicationSessionCookieConfig.getSessionCookieName( context );
    }

}
