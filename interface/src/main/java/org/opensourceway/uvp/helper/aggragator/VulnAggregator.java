package org.opensourceway.uvp.helper.aggragator;

import org.opensourceway.uvp.entity.Vulnerability;
import org.opensourceway.uvp.enums.VulnSource;

import java.util.List;

/**
 * Aggregate vulnerabilities from different sources.
 *
 * @see VulnSource
 */
public interface VulnAggregator {
    /**
     * Aggregate all vulns collected from different {@link VulnSource}s that affect a specific package.
     *
     * @param vulns All vulns collected from different sources that affect a specific package.
     * @return Aggregated vulns. There SHOULD NOT exist duplicate vulns with the same id.
     */
    List<Vulnerability> aggregate(List<Vulnerability> vulns);
}
