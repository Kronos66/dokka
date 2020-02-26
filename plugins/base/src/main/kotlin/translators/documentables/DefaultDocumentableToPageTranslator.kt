package org.jetbrains.dokka.base.translators.documentables

import org.jetbrains.dokka.base.transformers.pages.comments.CommentsToContentConverter
import org.jetbrains.dokka.model.Module
import org.jetbrains.dokka.pages.ModulePageNode
import org.jetbrains.dokka.transformers.documentation.DocumentableToPageTranslator
import org.jetbrains.dokka.utilities.DokkaLogger

class DefaultDocumentableToPageTranslator(
    private val commentsToContentConverter: CommentsToContentConverter,
    private val logger: DokkaLogger
) : DocumentableToPageTranslator {
    override fun invoke(module: Module): ModulePageNode =
        DefaultPageCreator(commentsToContentConverter, logger).pageForModule(module)
}