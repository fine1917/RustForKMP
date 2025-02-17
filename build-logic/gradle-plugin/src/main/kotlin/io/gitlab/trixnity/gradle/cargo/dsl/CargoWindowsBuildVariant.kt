/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package io.gitlab.trixnity.gradle.cargo.dsl

import io.gitlab.trixnity.gradle.Variant
import io.gitlab.trixnity.gradle.cargo.rust.targets.RustWindowsTarget
import org.gradle.api.Project
import javax.inject.Inject

abstract class CargoWindowsBuildVariant @Inject constructor(
    project: Project,
    build: CargoWindowsBuild,
    variant: Variant,
    extension: CargoExtension,
) : DefaultCargoBuildVariant<RustWindowsTarget, CargoWindowsBuild>(project, build, variant, extension),
    CargoJvmBuildVariant<RustWindowsTarget>
