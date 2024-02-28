package com.mpierucci.resourcereporducer.resources

import androidx.compose.runtime.Composable
import composeresourcereproducer.resources.generated.resources.Res
import composeresourcereproducer.resources.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun composeMultiPlatformPainter() = painterResource(Res.drawable.compose_multiplatform)