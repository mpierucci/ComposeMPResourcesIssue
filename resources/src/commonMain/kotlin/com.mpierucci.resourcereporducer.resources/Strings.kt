package com.mpierucci.resourcereporducer.resources

import androidx.compose.runtime.Composable
import composeresourcereproducer.resources.generated.resources.Res
import composeresourcereproducer.resources.generated.resources.hello_world
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun greetingsString(): String  = stringResource(Res.string.hello_world)